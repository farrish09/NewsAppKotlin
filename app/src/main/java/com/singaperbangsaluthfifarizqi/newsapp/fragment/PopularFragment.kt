package com.singaperbangsaluthfifarizqi.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.singaperbangsaluthfifarizqi.newsapp.data.DataNews
import com.singaperbangsaluthfifarizqi.newsapp.adapter.NewsAdapter
import com.singaperbangsaluthfifarizqi.newsapp.R
import com.singaperbangsaluthfifarizqi.newsapp.initViewHeadline

class PopularFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        val rvNews = view.findViewById<RecyclerView>(R.id.rv_popular_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.listPopularNews)


        initViewHeadline(view,1)

        return view
    }


}