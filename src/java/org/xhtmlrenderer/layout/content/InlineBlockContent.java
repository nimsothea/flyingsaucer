/*
 * InlineBlockContent.java
 * Copyright (c) 2004, 2005 Torbj�rn Gannholm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */
package org.xhtmlrenderer.layout.content;

import org.w3c.dom.Element;
import org.xhtmlrenderer.css.newmatch.CascadedStyle;
import org.xhtmlrenderer.layout.LayoutContext;

import java.util.List;


/**
 * @author Torbj�rn Gannholm
 */
public class InlineBlockContent extends AbstractCachingContent implements Content {
    private Element _elem;

    private CascadedStyle _style;

    InlineBlockContent(Element e, CascadedStyle style) {
        _elem = e;
        _style = style;
    }

    public String toString() {
        return "InlineBlock: " + _elem.getNodeName();
    }

    public Element getElement() {
        return _elem;
    }

    public CascadedStyle getStyle() {
        return _style;
    }
    
    protected List makeChildContent(LayoutContext c) {
        return ContentUtil.getChildContentList(c, this);
    }
}

