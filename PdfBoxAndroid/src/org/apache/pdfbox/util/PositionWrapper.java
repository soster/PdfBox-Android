package org.apache.pdfbox.util;

/**
 * wrapper of TextPosition that adds flags to track
 * status as linestart and paragraph start positions.
 * <p>
 * This is implemented as a wrapper since the TextPosition
 * class doesn't provide complete access to its
 * state fields to subclasses.  Also, conceptually TextPosition is
 * immutable while these flags need to be set post-creation so
 * it makes sense to put these flags in this separate class.
 * </p>
 * @author m.martinez@ll.mit.edu
 *
 */
public class PositionWrapper
{

    private boolean isLineStart = false;
    private boolean isParagraphStart = false;
    private boolean isPageBreak = false;
    private boolean isHangingIndent = false;
    private boolean isArticleStart = false;

    private TextPosition position = null;

    /**
     * Returns the underlying TextPosition object.
     * @return the text position
     */
    public TextPosition getTextPosition()
    {
        return position;
    }


    public boolean isLineStart()
    {
        return isLineStart;
    }


    /**
     * Sets the isLineStart() flag to true.
     */
    public void setLineStart()
    {
        this.isLineStart = true;
    }


    public boolean isParagraphStart()
    {
        return isParagraphStart;
    }


    /**
     * sets the isParagraphStart() flag to true.
     */
    public void setParagraphStart()
    {
        this.isParagraphStart = true;
    }


    public boolean isArticleStart()
    {
        return isArticleStart;
    }


    /**
     * Sets the isArticleStart() flag to true.
     */
    public void setArticleStart()
    {
        this.isArticleStart = true;
    }


    public boolean isPageBreak()
    {
        return isPageBreak;
    }


    /**
     * Sets the isPageBreak() flag to true.
     */
    public void setPageBreak()
    {
        this.isPageBreak = true;
    }


    public boolean isHangingIndent()
    {
        return isHangingIndent;
    }


    /**
     * Sets the isHangingIndent() flag to true.
     */
    public void setHangingIndent()
    {
        this.isHangingIndent = true;
    }


    /**
     * Constructs a PositionWrapper around the specified TextPosition object.
     * @param position the text position
     */
    public PositionWrapper(TextPosition position)
    {
        this.position = position;
    }

}