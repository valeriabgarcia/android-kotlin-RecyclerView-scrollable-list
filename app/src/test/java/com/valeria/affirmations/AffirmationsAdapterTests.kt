package com.valeria.affirmations

import android.content.Context
import com.valeria.affirmations.adapter.ItemAdapter
import com.valeria.affirmations.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    @Test
    fun adapter_size() {

        val context = mock(Context::class.java)

        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }

}


