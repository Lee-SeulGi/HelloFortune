package com.example.hellofortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SleepActivity extends AppCompatActivity {
    ListView listView;
    ListItemAdapater adapter;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_sleep);

        listView = findViewById(R.id.listview_dream);
        adapter = new ListItemAdapater();

        adapter.addItem(new ListItem("< 파도가 잠잠한 꿈 >",
                "윗 사람의 인정을 받게 될 꿈입니다. 혹 실수를 하더라도 능력을 인정하고 믿어주는" +
                        "상사가 있으니 모든 일에 희망이 있고 웃음이 끊이지 않겠습니다."));
        adapter.addItem(new ListItem("< 유명한 연예인을 따라가는 꿈 >",
                "밖에 나가 사람들을 만나는 과정에 우연히 뜻밖의 사람을 만나 인연을 맺게 됩니다." +
                        "동경의 대상으로 여겨 그 사람에게 충성을 다하게 되고 만남에 대해 흡족해 하게 됩니다."));
        adapter.addItem(new ListItem("< 총을 쏘며 죽이는 꿈 >",
                "어떠한 세력을 잡거나 기관을 통해서 능력을 과시하게 될 꿈입니다." +
                        "또한 도모하는 일의 기회를 얻어서 자신의 능력을 행사 할 일이 있을 것입니다."));
        adapter.addItem(new ListItem("< 돌아가신 할머니를 따라가는 꿈 >",
                "꿈에 나타나는 이가 누가 되었던지 죽은 사람을 따라가는 것은 죽음을 암시하는 꿈입니다." +
                        "죽음이 아니라면 근심이나 우환, 큰 병을 얻거나 다치는 것을 예지하는 꿈이라 할 수 있습니다."));
        adapter.addItem(new ListItem("< 고양이가 얼굴을 할퀴는 꿈 >",
                "싸움에 휘말리게 되거나 각종 사고로 인해 신상에 해가 될 일이 생긴다는 꿈입니다." +
                        "혹은 구설에 올라 사람들에게 비난을 받게 되고 치한에게 당하는 수가 있으니 각별히 주의해야 합니다."));
        adapter.addItem(new ListItem("< 대통령과 얘기하는 꿈 >",
                "뛰어난 실력에 재능을 고루 갖춘 인물에게 배움을 받거나 도움으로 성공하게 된다는 꿈입니다." +
                        "튼실하게 기반을 다져놓아 그 분야의 최고 실력자로 거듭나게 됩니다."));
        adapter.addItem(new ListItem("< 밤송이를 따는 꿈 >",
                "오랫동안 소원한 바를 이루게 될 꿈입니다. 특히 응시한 시험에서 좋은 결과를 얻어 합격을 하고" +
                        "기혼자는 원하는 임신을 하여 기쁨을 누릴 것이니 재정의 어려움에 시달리지 않도록 각별히 주의하여 일을 추진하십시오."));
        adapter.addItem(new ListItem("< 혼자 걸어가는 꿈 >",
                "동쪽에서 귀인을 만나게 되는 길몽입니다. 동쪽에서 온 사람이 있으면 반갑게 맞으십시오." +
                        "그 분이 도움을 줄 수 있는 귀인입니다."));
        adapter.addItem(new ListItem("< 물 위에 앉아 있는 꿈 >",
                "입신양명 하여 직위가 높아질 꿈입니다. 선거에 출마하여 당선이 되고 원하는 소원을 이루게 될 것이니" +
                        "매사에 최선을 다한다면 반드시 좋은 성과가 있겠습니다."));
        adapter.addItem(new ListItem("< 큰 거미가 집에 들어오는 꿈 >",
                "집 안에 경사스런 일이 생길 꿈입니다. 또한 뜻밖의 기쁜 소식을 듣고 막대한" +
                        "부를 축적하게 될 것이니 매사 최선을 다하여 부귀와 영화를 누리시기 바랍니다."));
        adapter.addItem(new ListItem("< 호랑이가 집안을 난장판으로 만드는 꿈 >",
                "이 꿈은 윗사람이나 선배가 자신의 권력을 미끼로 횡포를 부려 당신이" +
                        "정신적인 고통을 받게 됨을 암시하는 꿈입니다."));
        adapter.addItem(new ListItem("< 길이 갈라지는 꿈 >",
                "질병이 있던 사람이 건강을 회복하게 될 꿈입니다. 또한 건강한 사람이더라도 속병이 있을 수 있으니" +
                        "잠시 업무를 멈추고 휴식을 하는 것이 좋겠습니다."));
        adapter.addItem(new ListItem("< 자신이 차에 치어 죽는 꿈 >",
                "자신이 원하던 것이 어떤 기관이나 실력자로 인해 성취가 된다는 꿈입니다. 이로 인해 점차" +
                        "번성하게 되며 높은 자리를 앉게 되는 등 좋은 결과로 돌아오게 됩니다."));
        adapter.addItem(new ListItem("< 부모와 사별하는 꿈 >",
                "늙은 부모의 죽음은 자식에게 행운과 희소식을 가져다 주는 꿈입니다. 하지만 건강한" +
                        "아버지가 죽었다면 점차 가세가 기울어 몰락하고 가난한 생활을 하게 됩니다."));
        adapter.addItem(new ListItem("< 친구가 사망하는 꿈 >",
                "죽음이란 마무리임과 동시에 새로운 출발의 가능성을 지니는 꿈입니다." +
                        "꿈에서 본 그 친구가 장수할 길몽입니다."));
        adapter.addItem(new ListItem("< 오랜만에 만난 친구가 반기며 기뻐하는 꿈 >",
                "친구를 오랜만에 만나는 꿈은 기쁜 일이 생기게 되는 꿈입니다. 특히 생각지도 않고," +
                        "기대하지도 않고 있던 일이 잘풀리게 되는 아주 좋은 꿈이랍니다."));
        adapter.addItem(new ListItem("< 복권을 추첨하는 자리에서 복권을 얻는 꿈 >",
                "이것은 꿈의 상황이 현실에서 똑같이 벌어지는 것을 나타내는 꿈입니다. 실제로 복권 추첨을 하는" +
                        "장소에서 복권을 얻을 것이니 기회가 있다면 반드시 도전하십시오."));
        adapter.addItem(new ListItem("< 복권을 사거나 얻는 꿈 >",
                "이 꿈은 상품권, 계약증권, 소개장, 임명장 등을 받을 것을 암시하는 꿈입니다." +
                        "좋은 일이 생길테니 설레이는 마음으로 기대해 봐도 좋습니다."));
        adapter.addItem(new ListItem("< 복권의 일련 번호나 순위가 확실히 기억나는 꿈 >",
                "꿈이 현실로 이루어지는 경우가 많으니 실제 복권에 행운을 기대해 보시면 좋은" +
                        "결과가 있을 것입니다. 즉, 투시적인 꿈으로 복금을 탈 수 있음을 뜻합니다."));

        listView.setAdapter(adapter);

        Button backMunu = (Button) findViewById(R.id.btn_backmenu);
        backMunu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent backmenuintent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(backmenuintent);
            }
        });
    }



}

