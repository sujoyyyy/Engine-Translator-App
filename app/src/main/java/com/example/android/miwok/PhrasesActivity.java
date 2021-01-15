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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Every nook and corner", "kona kona"));
        words.add(new Word("to go hand in hand", "saath saath chalna"));
        words.add(new Word("by hook or crook", "kisi bhi tarah"));
        words.add(new Word("feather in one's cap", "sar par taj rakha hona"));
        words.add(new Word("turn deaf ears", "dhyaan nhi dena"));
        words.add(new Word("chicken hearted", "kamzor dil"));
        words.add(new Word("Stop short of something", "thode se reh jaana"));
        words.add(new Word("being busy doing nothing", "samay barbaad karna"));
        words.add(new Word("Room for improvement", "abhi aur accha ho sakta hai"));
        words.add(new Word("Chuckle in one's sleeves", "chupke se hasna"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
