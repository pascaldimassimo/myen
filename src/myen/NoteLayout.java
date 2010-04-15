package myen;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

public class NoteLayout implements LayoutManager2
{
    private static final int SEPARATOR_HEIGHT = 10;
    private static final int MIN_NOTE_HEIGHT = 30;

    @Override
    public void addLayoutComponent(Component comp, Object constraints)
    {
    }

    @Override
    public void addLayoutComponent(String name, Component comp)
    {
    }

    @Override
    public void removeLayoutComponent(Component comp)
    {
    }

    @Override
    public float getLayoutAlignmentX(Container target)
    {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container target)
    {
        return 0;
    }

    @Override
    public void invalidateLayout(Container target)
    {
    }

    @Override
    public Dimension maximumLayoutSize(Container target)
    {
        return preferredLayoutSize(target);
    }

    @Override
    public void layoutContainer(Container parent)
    {
        int x = 0;
        int y = 0;
        int width = parent.getWidth();
        for (int i = 0; i < parent.getComponentCount(); i++)
        {
            Component component = parent.getComponent(i);
            Dimension preferredSize = component.getPreferredSize();
            int height = Math.max(MIN_NOTE_HEIGHT, (int) preferredSize.getHeight());
            component.setBounds(x, y, width, height);
            y += height + SEPARATOR_HEIGHT;
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container parent)
    {
        return preferredLayoutSize(parent);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent)
    {
        int height = 0;
        for (int i = 0; i < parent.getComponentCount(); i++)
        {
            Component component = parent.getComponent(i);
            Dimension preferredSize = component.getPreferredSize();
            height += Math.max(MIN_NOTE_HEIGHT, (int) preferredSize.getHeight());
            height += SEPARATOR_HEIGHT;
        }

        return new Dimension(parent.getWidth(), height);
    }

}
