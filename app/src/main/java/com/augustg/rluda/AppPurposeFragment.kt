package com.augustg.rluda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.augustg.loggerdude.LoggerDude
import com.augustg.rluda.databinding.FragmentAppPurposeBinding
import com.augustg.rluda.util.pulse

class AppPurposeFragment : Fragment() {

    private lateinit var binding: FragmentAppPurposeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppPurposeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        LoggerDude.log("AppPurposeFragment.onActivityCreated")

        binding.startButton.setOnClickListener {
            LoggerDude.log("Try It Out! clicked")

            // post Logs
            LoggerDude.log("Dumping logs")
            LoggerDude.dump()
        }

        binding.startButton.pulse(
            fadeInDuration = 50,
            fadeOutDuration = 400,
            delayBetween = 2500,
            initialDelay = 2000
        )
    }
}