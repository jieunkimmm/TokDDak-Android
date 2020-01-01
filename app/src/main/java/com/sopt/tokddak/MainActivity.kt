package com.sopt.tokddak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.sopt.tokddak.ViewHolder.TripAdapter
import com.sopt.tokddak.mypage.MypagePagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recycler_mypage : RecyclerView
    private lateinit var tripAdapter : TripAdapter
    private lateinit var pagerAdapter : MypagePagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setting)

//        configureMainTab()
//        pagerAdapter = MypagePagerAdapter(supportFragmentManager)
//
//        pagerAdapter.addFragment(mytravel_fragment())
//        pagerAdapter.addFragment(travel_candidate_fragment())
//        vp_mypage_product.adapter = pagerAdapter
//
//        vp_mypage_product.currentItem = 0
//
//        vp_mypage_product.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tl_mytpage))
//
//        tl_mytpage.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
//            override fun onTabReselected(p0: TabLayout.Tab?) {
//            }
//
//            override fun onTabUnselected(p0: TabLayout.Tab?) {
//            }
//
//            override fun onTabSelected(p0: TabLayout.Tab?) {
//                vp_mypage_product.currentItem = p0!!.position
//            }
//
//        })
    }
//    private fun configureMainTab(){
//
//        val navMypageCategoryLayout: View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
//            .inflate(R.layout.navigation_mypage, null, false)
//        tl_mytpage.addTab(tl_mytpage.newTab())
//        tl_mytpage.addTab(tl_mytpage.newTab())
//        tl_mytpage.getTabAt(0)!!.customView = navMypageCategoryLayout.findViewById(R.id.const_nav_my_travel) as ConstraintLayout
//        tl_mytpage.getTabAt(1)!!.customView = navMypageCategoryLayout.findViewById(R.id.const_nav_tavel_candidater) as ConstraintLayout
//
//    }
}
