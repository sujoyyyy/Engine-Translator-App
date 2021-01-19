/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Every nook and corner", "kona kona",R.raw.kona));
        words.add(new Word("to go hand in hand", "saath saath chalna",R.raw.saath));
        words.add(new Word("by hook or crook", "kisi bhi tarah",R.raw.kisi));
        words.add(new Word("feather in one's cap", "sar par taj rakha hona",R.raw.sar));
        words.add(new Word("turn deaf ears", "dhyaan nhi dena",R.raw.dhyaan));
        words.add(new Word("chicken hearted", "kamzor dil",R.raw.kamzor));
        words.add(new Word("Stop short of something", "thode se reh jaana",R.raw.thode));
        words.add(new Word("being busy doing nothing", "samay barbaad karna",R.raw.samay));
        words.add(new Word("Room for improvement", "abhi aur accha ho sakta hai",R.raw.abhi));
        words.add(new Word("Chuckle in one's sleeves", "chupke se hasna",R.raw.chupke));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}
