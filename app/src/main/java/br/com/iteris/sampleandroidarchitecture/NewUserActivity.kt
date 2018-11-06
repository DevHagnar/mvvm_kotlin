package br.com.iteris.sampleandroidarchitecture

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_new_user.*

class NewUserActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)
    }

    fun onClickSave(view: View){
        et_name.let {
            val returnIntent = Intent()
            returnIntent.putExtra("result", it.text.toString())
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
    }
}