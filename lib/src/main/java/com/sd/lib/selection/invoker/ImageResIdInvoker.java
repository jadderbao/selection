package com.sd.lib.selection.invoker;

import android.view.View;
import android.widget.ImageView;

public class ImageResIdInvoker implements PropertyInvoker<Integer>
{
    @Override
    public void invoke(View view, Integer value)
    {
        if (value == null)
            return;
        if (!(view instanceof ImageView))
            throw new IllegalArgumentException("view must be instance of ImageView");

        final ImageView imageView = (ImageView) view;
        imageView.setImageResource(value);
    }
}
