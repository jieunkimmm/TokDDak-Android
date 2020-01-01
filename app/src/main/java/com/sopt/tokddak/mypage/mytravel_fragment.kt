package com.sopt.tokddak.mypage


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.sopt.tokddak.R
import com.sopt.tokddak.ViewHolder.TripAdapter
import com.sopt.tokddak.ViewHolder.TripData
import kotlinx.android.synthetic.main.fragment_mytravel_fragment.*

/**
 * A simple [Fragment] subclass.
 */
class mytravel_fragment : Fragment() {
    private lateinit var tripAdapter : TripAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mytravel_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        initTripRepoList()
    }

    private fun initTripRepoList() {

        tripAdapter = TripAdapter(context!!)

        recycler_mypage.adapter = tripAdapter

        recycler_mypage.layoutManager = GridLayoutManager(context, 2) as RecyclerView.LayoutManager?

        tripAdapter.data = listOf(
            TripData(
                "파리지앵 하실?",
                "1,200,000원",
                "파리, 프랑스",
                "2020.01.08 - 2020.01.13"
            ),
            TripData(
                "파리지앵 하실?",
                "1,200,000원",
                "파리, 프랑스",
                "2020.01.08 - 2020.01.13"
            ),
            TripData(
                "파리지앵 하실?",
                "1,200,000원",
                "파리, 프랑스",
                "2020.01.08 - 2020.01.13"
            ),
            TripData(
                "파리지앵 하실?",
                "1,200,000원",
                "파리, 프랑스",
                "2020.01.08 - 2020.01.13"
            ),
            TripData(
                "파리지앵 하실?",
                "1,200,000원",
                "파리, 프랑스",
                "2020.01.08 - 2020.01.13"
            ),
            TripData(
                "파리지앵 하실?",
                "1,200,000원",
                "파리, 프랑스",
                "2020.01.08 - 2020.01.13"
            )
        )

        // 데이터 변경완료, 리스트 갱신
        tripAdapter.notifyDataSetChanged()
    }

}
