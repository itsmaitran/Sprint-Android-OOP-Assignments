package com.lambdaschool.interfaces

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lambdaschool.interfaces.model.Vehicle
import com.lambdaschool.interfaces.model.VehicleList
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*

class ItemDetailFragment : Fragment() {

    private var item: Vehicle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                item = VehicleList.vehicles_map[it.getString(ARG_ITEM_ID)]

                activity?.toolbar_layout?.let { layout ->
                    layout.title = item?.id
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        item?.let {
            rootView.tv_vehicle_detail.text = it.travel()
            rootView.btn_favorite.text = it.favorite.toString()
        }

        rootView.btn_favorite.setOnClickListener {
            if (item?.favorite == true) {
                item?.favorite = false
            } else {
                item?.favorite = true
            }
            rootView.btn_favorite.text = item?.favorite.toString()
        }

        return rootView
    }

    companion object {

        const val ARG_ITEM_ID = "item_id"
    }
}
