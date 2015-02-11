/*
 *
 *  * Copyright 2015 Atanas Dimitrov <atanas@naughtyspirit.co>
 *  *                 NaughtySpirit 2014
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.naughtyspirit.showcasetutorial;

import android.view.View;

import com.naughtyspirit.showcasetutorial.targets.Target;

/**
 * Created by Seishin <atanas@naughtyspirit.co>
 * on 2/10/15.
 *
 * NaughtySpirit 2015
 */
public interface ShowcaseTutorialInterface {

    public static enum ItemPosition {
        TOP_LEFT, TOP_CENTER, TOP_RIGHT,
        CENTER_LEFT, CENTER, CENTER_RIGHT,
        BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
    }

    public void setTarget(Target target);
    public Target getTarget();

    public void setBackgroundColor(String color);
    public void setBackgroundColor(int color);

    public void setDescription(String description, ItemPosition position);
    public void setButton(String text, ItemPosition position);

    public void setButtonOnClickListener(View.OnClickListener listener);

    public void hide();
}
