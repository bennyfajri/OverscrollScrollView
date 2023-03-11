package com.drsync.overscrolllayout

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.dynamicanimation.animation.SpringForce
import androidx.recyclerview.widget.LinearLayoutManager
import com.drsync.overscrolllayout.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var mAdapter: RecyclerAdapter
    private lateinit var bounceEdgeEffectFactory: BounceEdgeEffectFactory
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAdapter = RecyclerAdapter {  }
        bounceEdgeEffectFactory = BounceEdgeEffectFactory()
        layoutManager = LinearLayoutManager(this@SecondActivity)

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
        bounceEdgeEffectFactory.apply {
            mSpringForce = SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY
            overScrollTranslationMagnitude = 0.2f
            flingTranslationMagnitude = 0.2f
        }

        binding.rvItemHorizontal.apply {
            adapter = mAdapter
            layoutManager = layoutManager
            edgeEffectFactory =  bounceEdgeEffectFactory
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_layout_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_vertical -> {
                layoutManager = LinearLayoutManager(this@SecondActivity)
                binding.rvItemHorizontal.layoutManager = layoutManager
            }
            R.id.menu_horizontal -> {
                layoutManager = LinearLayoutManager(this@SecondActivity, LinearLayoutManager.HORIZONTAL, false)
                binding.rvItemHorizontal.layoutManager = layoutManager
            }
        }
        return true
    }
}