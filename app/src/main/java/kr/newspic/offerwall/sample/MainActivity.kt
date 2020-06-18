package kr.newspic.offerwall.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kr.newspic.offerwall.NewspicOfferwall

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container_offerwall.setOnClickListener {
            NewspicOfferwall.setTestMode(switch_test_mode.isChecked)

            val userId = et_user_id.text.toString()
            val parameters = HashMap<String, String>()
            parameters["userId"] = userId

            // 포스트백으로 전달받을 파라미터 설정
            NewspicOfferwall.setParameters(parameters)

            NewspicOfferwall.openOfferwall(this)
        }
    }
}
