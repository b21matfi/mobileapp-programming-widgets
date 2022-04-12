
# Rapport


Jag började med att ändra till linear layout, detta gjorde jag med att lägga till linear istället för constraint layout. efter det la jag till en knapp
som heter sign in och den använde jag för att logga in till profilen. Edittext användes för att skriva in sitt använder namn. Detta gjordes
genom att bara lägga till edit text och sedan att man självska skriva in sitt eget namn. Koden som man kan se lite längre ner så ser man att jag har skapat imageview edittext och button, varje element har sitt eget
id så det är möjligt att hämta det. tillsist i mainacivity så har jag gjort 2 stycken variabler för username och själva knappen först så gjorde jag knappen så att den fungerar. När man klickar på knappen så flyttas
man till en annan sida alltså sin egen profil. När man skriver in sitt namn så kommer man se sitt eget namn på den andra sidan, koden till det finns inte med.



```xml
    <Button
        android:id="@+id/myButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Signin"
        android:layout_marginLeft="600dp"
        />
```
figur: 1
```java
            private Button Signin;
            private EditText Username;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Username = findViewById(R.id.myUsername);
                Signin = findViewById(R.id.myButton);
                Signin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("==>", "MainActivity button pressed");
                        Log.d("==>", "Username"+Username.getText().toString());



                        Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                        startActivity(intent);

                        intent.putExtra("Username",Username.getText().toString());
                        startActivity(intent);
                    }
                });
            }
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
