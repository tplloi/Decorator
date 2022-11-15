/*
 * Copyright (c) 2021. Rúben Sousa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rubensousa.decorator

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler

/**
 * Checks if a decoration should be applied for a given adapter position
 */
interface DecorationLookup {

    /**
     * @param position The current layout position. See [LayoutParams.getViewLayoutPosition]
     *
     * @param itemCount the item count at the layout stage. See [RecyclerView.State.getItemCount]
     *
     * @return true if the item at [position] should have decoration applied to
     */
    fun shouldApplyDecoration(position: Int, itemCount: Int, itemViewType: Int): Boolean

}
