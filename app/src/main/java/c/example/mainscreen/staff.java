package c.example.mainscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class staff extends AppCompatActivity {
    RatingBar rratingBar1, rratingBar2, rratingBar3, rratingBar4, rratingBar5;
    TextView mRatingScale1, mRatingScale2,mRatingScale3,mRatingScale4,mRatingScale5;
    TextView name1, name2, name3, name4, name5;
    EditText eenter_ct1, eenter_ct2, eenter_ct3, eenter_ct4, eenter_ct5;
    Button mSendFeedback;
    int i=0;
    float total = 0;
    float average;
    FirebaseDatabase database;
    DatabaseReference reference;
    Feedback feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        feedback = new Feedback();

        rratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
        rratingBar2 = (RatingBar) findViewById(R.id.ratingBar2);
        rratingBar3 = (RatingBar) findViewById(R.id.ratingBar3);
        rratingBar4 = (RatingBar) findViewById(R.id.ratingBar4);
        rratingBar5 = (RatingBar) findViewById(R.id.ratingBar5);

        mRatingScale1 = (TextView) findViewById(R.id.textView1);
        mRatingScale2 = (TextView) findViewById(R.id.textView2);
        mRatingScale3 = (TextView) findViewById(R.id.textView3);
        mRatingScale4 = (TextView) findViewById(R.id.textView4);
        mRatingScale5 = (TextView) findViewById(R.id.textView5);

        name1 = (TextView) findViewById(R.id.textView001);
        name2 = (TextView) findViewById(R.id.textView002);
        name3 = (TextView) findViewById(R.id.textView003);
        name4 = (TextView) findViewById(R.id.textView004);
        name5 = (TextView) findViewById(R.id.textView005);

        eenter_ct1 = (EditText) findViewById(R.id.enter_ct1);
        eenter_ct2 = (EditText) findViewById(R.id.enter_ct2);
        eenter_ct3 = (EditText) findViewById(R.id.enter_ct3);
        eenter_ct4 = (EditText) findViewById(R.id.enter_ct4);
        eenter_ct5 = (EditText) findViewById(R.id.enter_ct5);

        mSendFeedback = (Button) findViewById(R.id.btnSubmit);

        reference =database.getInstance().getReference().child("Feedback");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                if (datasnapshot.exists()){
                    i = (int)datasnapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //////
            }
        });

        rratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale1.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale1.setText("~~~Bad~~~");
                        break;
                    case 2:
                        mRatingScale1.setText("~~~Okay~~~");
                        break;
                    case 3:
                        mRatingScale1.setText("~~~Not bad~~~");
                        break;
                    case 4:
                        mRatingScale1.setText("~~~Good enough~~~");
                        break;
                    case 5:
                        mRatingScale1.setText("~~~Perfect~~~");
                        break;
                    default:
                        mRatingScale1.setText("");
                }
            }
        });

        rratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale2.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale2.setText("~~~Bad~~~");
                        break;
                    case 2:
                        mRatingScale2.setText("~~~Okay~~~");
                        break;
                    case 3:
                        mRatingScale2.setText("~~~Not bad~~~");
                        break;
                    case 4:
                        mRatingScale2.setText("~~~Good enough~~~");
                        break;
                    case 5:
                        mRatingScale2.setText("~~~Perfect~~~");
                        break;
                    default:
                        mRatingScale2.setText("");
                }
            }
        });

        rratingBar3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale3.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale3.setText("~~~Bad~~~");
                        break;
                    case 2:
                        mRatingScale3.setText("~~~Okay~~~");
                        break;
                    case 3:
                        mRatingScale3.setText("~~~Not bad~~~");
                        break;
                    case 4:
                        mRatingScale3.setText("~~~Good enough~~~");
                        break;
                    case 5:
                        mRatingScale3.setText("~~~Perfect~~~");
                        break;
                    default:
                        mRatingScale3.setText("");
                }
            }
        });

        rratingBar4.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale4.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale4.setText("~~~Bad~~~");
                        break;
                    case 2:
                        mRatingScale4.setText("~~~Okay~~~");
                        break;
                    case 3:
                        mRatingScale4.setText("~~~Not bad~~~");
                        break;
                    case 4:
                        mRatingScale4.setText("~~~Good enough~~~");
                        break;
                    case 5:
                        mRatingScale4.setText("~~~Perfect~~~");
                        break;
                    default:
                        mRatingScale4.setText("");
                }
            }
        });

        rratingBar5.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale5.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale5.setText("~~~Bad~~~");
                        break;
                    case 2:
                        mRatingScale5.setText("~~~Okay~~~");
                        break;
                    case 3:
                        mRatingScale5.setText("~~~Not bad~~~");
                        break;
                    case 4:
                        mRatingScale5.setText("~~~Good enough~~~");
                        break;
                    case 5:
                        mRatingScale5.setText("~~~Perfect~~~");
                        break;
                    default:
                        mRatingScale5.setText("");
                }
            }
        });

        mSendFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name1 = name1.getText().toString();
                String Name2 = name2.getText().toString();
                String Name3 = name3.getText().toString();
                String Name4 = name4.getText().toString();
                String Name5 = name5.getText().toString();

                String Comment1 = eenter_ct1.getText().toString();
                String Comment2 = eenter_ct2.getText().toString();
                String Comment3 = eenter_ct3.getText().toString();
                String Comment4 = eenter_ct4.getText().toString();
                String Comment5 = eenter_ct5.getText().toString();

                String Rating1 = mRatingScale1.getText().toString();
                String Rating2 = mRatingScale2.getText().toString();
                String Rating3 = mRatingScale3.getText().toString();
                String Rating4 = mRatingScale4.getText().toString();
                String Rating5 = mRatingScale5.getText().toString();

                feedback.setName1(name1.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setComment1(eenter_ct1.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setRating1(mRatingScale1.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);

                feedback.setName2(name2.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setComment2(eenter_ct2.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setRating2(mRatingScale2.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);

                feedback.setName3(name3.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setComment3(eenter_ct3.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setRating3(mRatingScale3.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);

                feedback.setName4(name4.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setComment4(eenter_ct4.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setRating4(mRatingScale4.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);

                feedback.setName5(name5.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setComment5(eenter_ct5.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);
                feedback.setRating5(mRatingScale5.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(feedback);

                if (rratingBar1.getRating() == 0.0) {
                    Toast.makeText(staff.this, "Please enter a rating", Toast.LENGTH_LONG).show();
                } else {
                    eenter_ct1.setText("");
                    rratingBar1.setRating(0);
                    i=i+1;
                    total += rratingBar1.getRating();
                    average = total /i ;
                    Toast.makeText(staff.this, "Thanks for the rating", Toast.LENGTH_SHORT).show();
                }

                if (rratingBar2.getRating() == 0.0) {
                    Toast.makeText(staff.this, "Please enter a rating", Toast.LENGTH_LONG).show();
                } else {
                    eenter_ct2.setText("");
                    rratingBar2.setRating(0);
                    i=i+1;
                    total += rratingBar2.getRating();
                    average = total /i ;
                    Toast.makeText(staff.this, "Thanks for the rating", Toast.LENGTH_SHORT).show();
                }

                if (rratingBar3.getRating() == 0.0) {
                    Toast.makeText(staff.this, "Please enter a rating", Toast.LENGTH_LONG).show();
                } else {
                    eenter_ct3.setText("");
                    rratingBar3.setRating(0);
                    i=i+1;
                    total += rratingBar3.getRating();
                    average = total /i ;
                    Toast.makeText(staff.this, "Thanks for the rating", Toast.LENGTH_SHORT).show();
                }


                if (rratingBar4.getRating() == 0.0) {
                    Toast.makeText(staff.this, "Please enter a rating", Toast.LENGTH_LONG).show();
                } else {
                    eenter_ct4.setText("");
                    rratingBar4.setRating(0);
                    i=i+1;
                    total += rratingBar4.getRating();
                    average = total /i ;
                    Toast.makeText(staff.this, "Thanks for the rating", Toast.LENGTH_SHORT).show();
                }


                if (rratingBar5.getRating() == 0.0) {
                    Toast.makeText(staff.this, "Please enter a rating", Toast.LENGTH_LONG).show();
                } else {
                    eenter_ct5.setText("");
                    rratingBar5.setRating(0);
                    i=i+1;
                    total += rratingBar5.getRating();
                    average = total /i ;
                    Toast.makeText(staff.this, "Thanks for the rating", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}