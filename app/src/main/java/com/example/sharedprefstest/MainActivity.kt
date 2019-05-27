package com.example.sharedprefstest

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


const val SHARED_PREFS_FNAME = "myPrefsFile"

class MainActivity : AppCompatActivity() {

    lateinit var editTextAppointment1:  EditText
    lateinit var editTextAppointment2:  EditText
    lateinit var editTextAppointment3:  EditText
    lateinit var editTextAppointment4:  EditText
    lateinit var editTextAppointment5:  EditText
    lateinit var editTextAppointment6:  EditText
    lateinit var editTextAppointment7:  EditText
    lateinit var editTextAppointment8:  EditText
    lateinit var editTextAppointment9:  EditText
    lateinit var editTextAppointment10: EditText
    lateinit var editTextAppointment11: EditText

    lateinit var editTextTime1:   EditText
    lateinit var editTextTime2:   EditText
    lateinit var editTextTime3:   EditText
    lateinit var editTextTime4:   EditText
    lateinit var editTextTime5:   EditText
    lateinit var editTextTime6:   EditText
    lateinit var editTextTime7:   EditText
    lateinit var editTextTime8:   EditText
    lateinit var editTextTime9:   EditText
    lateinit var editTextTime10:  EditText
    lateinit var editTextTime11:  EditText

    lateinit var editTextDate1:   EditText
    lateinit var editTextDate2:   EditText
    lateinit var editTextDate3:   EditText
    lateinit var editTextDate4:   EditText
    lateinit var editTextDate5:   EditText
    lateinit var editTextDate6:   EditText
    lateinit var editTextDate7:   EditText
    lateinit var editTextDate8:   EditText
    lateinit var editTextDate9:   EditText
    lateinit var editTextDate10:  EditText
    lateinit var editTextDate11:  EditText


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextAppointment1 = findViewById(R.id.appointment1)
        editTextAppointment2 = findViewById(R.id.appointment2)
        editTextAppointment3 = findViewById(R.id.appointment3)
        editTextAppointment4 = findViewById(R.id.appointment4)
        editTextAppointment5 = findViewById(R.id.appointment5)
        editTextAppointment6 = findViewById(R.id.appointment6)
        editTextAppointment7 = findViewById(R.id.appointment7)
        editTextAppointment8 = findViewById(R.id.appointment8)
        editTextAppointment9 = findViewById(R.id.appointment9)
        editTextAppointment10 = findViewById(R.id.appointment10)
        editTextAppointment11 = findViewById(R.id.appointment11)

        editTextTime1 = findViewById(R.id.time1)
        editTextTime2 = findViewById(R.id.time2)
        editTextTime3 = findViewById(R.id.time3)
        editTextTime4 = findViewById(R.id.time4)
        editTextTime5 = findViewById(R.id.time5)
        editTextTime6 = findViewById(R.id.time6)
        editTextTime7 = findViewById(R.id.time7)
        editTextTime8 = findViewById(R.id.time8)
        editTextTime9 = findViewById(R.id.time9)
        editTextTime10 = findViewById(R.id.time10)
        editTextTime11 = findViewById(R.id.time11)

        editTextDate1 = findViewById(R.id.date1)
        editTextDate2 = findViewById(R.id.date2)
        editTextDate3 = findViewById(R.id.date3)
        editTextDate4 = findViewById(R.id.date4)
        editTextDate5 = findViewById(R.id.date5)
        editTextDate6 = findViewById(R.id.date6)
        editTextDate7 = findViewById(R.id.date7)
        editTextDate8 = findViewById(R.id.date8)
        editTextDate9 = findViewById(R.id.date9)
        editTextDate10 = findViewById(R.id.date10)
        editTextDate11 = findViewById(R.id.date11)


        retrieveData()

        findViewById<Button>(R.id.buttonSavePrefs).setOnClickListener {
            // Call a method to save the editTextName and editTextEmail text
            // Let's create our own method called:
            saveData()
        }
    }


    private fun retrieveData() {
        // Creating a SharedPreferences object so we can access the sharedPrefsFile
        // that we created in saveData().
        val mypref = getSharedPreferences(SHARED_PREFS_FNAME, Context.MODE_PRIVATE)

        val appointment1 = mypref.getString("appointment1", "")
        val appointment2 = mypref.getString("appointment2", "")
        val appointment3 = mypref.getString("appointment3", "")
        val appointment4 = mypref.getString("appointment4", "")
        val appointment5 = mypref.getString("appointment5", "")
        val appointment6 = mypref.getString("appointment6", "")
        val appointment7 = mypref.getString("appointment7", "")
        val appointment8 = mypref.getString("appointment8", "")
        val appointment9 = mypref.getString("appointment9", "")
        val appointment10 = mypref.getString("appointment10", "")
        val appointment11 = mypref.getString("appointment11", "")

        val time1 = mypref.getString("time1", "")
        val time2 = mypref.getString("time2", "")
        val time3 = mypref.getString("time3", "")
        val time4 = mypref.getString("time4", "")
        val time5 = mypref.getString("time5", "")
        val time6 = mypref.getString("time6", "")
        val time7 = mypref.getString("time7", "")
        val time8 = mypref.getString("time8", "")
        val time9 = mypref.getString("time9", "")
        val time10 = mypref.getString("time10", "")
        val time11 = mypref.getString("time11", "")

        val date1 = mypref.getString("date1", "")
        val date2 = mypref.getString("date2", "")
        val date3 = mypref.getString("date3", "")
        val date4 = mypref.getString("date4", "")
        val date5 = mypref.getString("date5", "")
        val date6 = mypref.getString("date6", "")
        val date7 = mypref.getString("date7", "")
        val date8 = mypref.getString("date8", "")
        val date9 = mypref.getString("date9", "")
        val date10 = mypref.getString("date10", "")
        val date11 = mypref.getString("date11", "")


        // Now we can finally read the data from the file and put it into the EditText controls
        editTextAppointment1.setText(appointment1)
        editTextAppointment2.setText(appointment2)
        editTextAppointment3.setText(appointment3)
        editTextAppointment4.setText(appointment4)
        editTextAppointment5.setText(appointment5)
        editTextAppointment6.setText(appointment6)
        editTextAppointment7.setText(appointment7)
        editTextAppointment8.setText(appointment8)
        editTextAppointment9.setText(appointment9)
        editTextAppointment10.setText(appointment10)
        editTextAppointment11.setText(appointment11)

        editTextTime1.setText(time1)
        editTextTime2.setText(time2)
        editTextTime3.setText(time3)
        editTextTime4.setText(time4)
        editTextTime5.setText(time5)
        editTextTime6.setText(time6)
        editTextTime7.setText(time7)
        editTextTime8.setText(time8)
        editTextTime9.setText(time9)
        editTextTime10.setText(time10)
        editTextTime11.setText(time11)

        editTextDate1.setText(date1)
        editTextDate2.setText(date2)
        editTextDate3.setText(date3)
        editTextDate4.setText(date4)
        editTextDate5.setText(date5)
        editTextDate6.setText(date6)
        editTextDate7.setText(date7)
        editTextDate8.setText(date8)
        editTextDate9.setText(date9)
        editTextDate10.setText(date10)
        editTextDate11.setText(date11)
    }


    private fun saveData() {
        // Now creating a SharedPreferences object
        val mypref = getSharedPreferences(SHARED_PREFS_FNAME, Context.MODE_PRIVATE)

        val editor = mypref.edit()

        editor.putString("appointment1", editTextAppointment1.text.toString())
        editor.putString("appointment2", editTextAppointment2.text.toString())
        editor.putString("appointment3", editTextAppointment3.text.toString())
        editor.putString("appointment4", editTextAppointment4.text.toString())
        editor.putString("appointment5", editTextAppointment5.text.toString())
        editor.putString("appointment6", editTextAppointment6.text.toString())
        editor.putString("appointment7", editTextAppointment7.text.toString())
        editor.putString("appointment8", editTextAppointment8.text.toString())
        editor.putString("appointment9", editTextAppointment9.text.toString())
        editor.putString("appointment10", editTextAppointment10.text.toString())
        editor.putString("appointment11", editTextAppointment11.text.toString())

        editor.putString("time1", editTextTime1.text.toString())
        editor.putString("time2", editTextTime2.text.toString())
        editor.putString("time3", editTextTime3.text.toString())
        editor.putString("time4", editTextTime4.text.toString())
        editor.putString("time5", editTextTime5.text.toString())
        editor.putString("time6", editTextTime6.text.toString())
        editor.putString("time7", editTextTime7.text.toString())
        editor.putString("time8", editTextTime8.text.toString())
        editor.putString("time9", editTextTime9.text.toString())
        editor.putString("time10", editTextTime10.text.toString())
        editor.putString("time11", editTextTime11.text.toString())

        editor.putString("date1", editTextDate1.text.toString())
        editor.putString("date2", editTextDate2.text.toString())
        editor.putString("date3", editTextDate3.text.toString())
        editor.putString("date4", editTextDate4.text.toString())
        editor.putString("date5", editTextDate5.text.toString())
        editor.putString("date6", editTextDate6.text.toString())
        editor.putString("date7", editTextDate7.text.toString())
        editor.putString("date8", editTextDate8.text.toString())
        editor.putString("date9", editTextDate9.text.toString())
        editor.putString("date10", editTextDate10.text.toString())
        editor.putString("date11", editTextDate11.text.toString())

        editor.apply()

        Toast.makeText(this, "Data saved", Toast.LENGTH_LONG).show()
    }
}

/*
// Removed from the saveData() function
        // Validation: test for empty user Name
        if(editTextName.text.isEmpty()) {
            editTextName.error = "Enter your fucking name!"
            return
        }

        // Validation: test for empty email address
        if(editTextEmail.text.isEmpty()) {
            editTextEmail.error = "Please enter your email address"
            return
        }
*/
