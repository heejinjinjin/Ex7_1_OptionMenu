package kr.ac.kopo.ex7_1_optionmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var imgV : ImageView
    lateinit var editDegree : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear = findViewById<LinearLayout>(R.id.linear)
        imgV = findViewById<ImageView>(R.id.imgV)
        editDegree = findViewById<EditText>(R.id.editDegree)

    }

    // 옵션 메뉴 등록
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmenu, menu)

        return true
    }

    // 항목이 선택 되었을 때 이벤트 처리할 수 있는 메소드
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.itemRotate -> {
                imgV.rotation = editDegree.text.toString().toFloat()
                return true
            }
            R.id.itemHanra -> {
                imgV.setImageResource(R.drawable.img1)
                item.setChecked(true)
                return true
            }
            R.id.itemChuja -> {
                imgV.setImageResource(R.drawable.img2)
                item.setChecked(true)
                return true
            }
            R.id.itemBum -> {
                imgV.setImageResource(R.drawable.img3)
                item.setChecked(true)
                return true
            }
        }

        return false
    }
}