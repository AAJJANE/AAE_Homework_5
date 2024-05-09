package com.example.aae_homework_5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Ship> ships = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ShipAdapter shipAdapter = new ShipAdapter(this, ships);

        recyclerView.setAdapter(shipAdapter);

    }

    private void setInitialData() {
        ships.add( new Ship("Истребитель TIE",
                "был стандартным имперским истребителем, массово выпускавшимся и использовавшимся во время Галактической гражданской войны. Популярным среди пилотов Альянса, а затем Новой Республики, разговорным названием истребителя было «Глазное яблоко».",
                R.drawable.tie));
        ships.add( new Ship("Перехватчик TIE",
                "также известный как TIE перехватчик (англ. TIE Interceptor), — разновидность TIE истребителя, стоявшая на вооружении Галактической Империи.",
                R.drawable.interceptor));
        ships.add( new Ship("Звездный разрушитель",
                "общее название класса военных космических кораблей, выполнявших роль крейсеров, линейных кораблей и авианосцев. Длина - от 1 до 2 км. Звёздные разрушители встречались во флотах Галактической Республикки, Галактической Империи, Новой Республики, Осколка Империи и других галактических государств.",
                R.drawable.stardestroyer));
        ships.add( new Ship("X-wing",
                "серия истребителей, произведённая корпорацией «Инком».Эти истребители использовались Альянсом повстанцев, Новой Республикой и Галактическим Альянсом.",
                R.drawable.xwing));
        ships.add( new Ship("«Тысячелетний сокол»",
                "легкий кореллианский грузовой корабль YT-1300, принадлежавший Хану Соло.Корабль пережил множество модификаций. В частности, были добавлены двигатели от списанных имперских кораблей и вооружение.",
                R.drawable.falcon));
        ships.add( new Ship("Лезвие бритвы",
                "канонерка, принадлежавшая Дину Джарину.[1] Когда-то она была военным кораблем, использовавшимся для патрулирования местных территорий до восхода Галактической Империи. ",
                R.drawable.razor));
        ships.add( new Ship("Истребитель Набу N-1",
                "звездолёт, разработанный проектной фирмой Тидского Дворцового Инженерного Корпуса Космических Кораблей специально для использования Королевским воздушно-оборонительным флотом Набу.",
                R.drawable.naboo));
        ships.add( new Ship("Шаттл «Лямбда»",
                "также известный как Имперский Лямбда, Имперский транспортник или Имперский шаттл — класс транспортного шаттла используемый Галактической Империей в период Галактической гражданской войныr. Эти шатлы использовали такие высокопоставленные лица империи как Дарт Вейдер и Император Шив Палпатин.",
                R.drawable.lambda));
        ships.add( new Ship("Палач",
                "звёздный дредноут типа «Палач», личный флагман Тёмного лорда ситхов Дарта Вейдера и один из крупнейших и мощнейших судов Империи из когда-либо созданных. С этого корабля Тёмный лорд руководил атакой на базу «Эхо» Альянса повстанцев.",
                R.drawable.executor));
        ships.add( new Ship("«Призрак»",
                "модифицированный лёгкий грузовой корабль модели VCX-100 производства «Кореллианской машиностроительной корпорации».",
                R.drawable.ghost));
    }
}