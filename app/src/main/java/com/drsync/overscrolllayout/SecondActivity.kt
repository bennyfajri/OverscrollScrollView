package com.drsync.overscrolllayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.drsync.overscrolllayout.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var mAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAdapter = RecyclerAdapter {  }
        val listColor = listOf(
            "#37306B",
            "#66347F",
            "#9E4784",
            "#D27685",
            "#2C3333",
            "#2E4F4F",
            "#0E8388",
            "#CBE4DE",
            "#F6E1C3",
            "#E9A178",
            "#A84448",
            "#7A3E65",
        )

        mAdapter.submitList(listColor)
        binding.rvItem.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(this@SecondActivity)
            edgeEffectFactory = BounceEdgeEffectFactory()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}