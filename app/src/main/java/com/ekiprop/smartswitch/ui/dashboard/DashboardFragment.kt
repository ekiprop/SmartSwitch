package com.ekiprop.smartswitch.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ekiprop.smartswitch.PowerAdapter
import com.ekiprop.smartswitch.R

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycleListView = view.findViewById<RecyclerView>(R.id.recyclerview_pwr)
        val adapter = PowerAdapter(recycleListView.context)
        recycleListView.adapter = adapter
        recycleListView.layoutManager = LinearLayoutManager(context)

       // dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel::class.java)
    }
}
