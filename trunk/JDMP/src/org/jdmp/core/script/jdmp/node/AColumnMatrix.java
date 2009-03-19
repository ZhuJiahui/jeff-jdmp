/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AColumnMatrix extends PMatrix
{
    private TLBracket _lBracket_;
    private PColumn _column_;
    private TRBracket _rBracket_;

    public AColumnMatrix()
    {
        // Constructor
    }

    public AColumnMatrix(
        @SuppressWarnings("hiding") TLBracket _lBracket_,
        @SuppressWarnings("hiding") PColumn _column_,
        @SuppressWarnings("hiding") TRBracket _rBracket_)
    {
        // Constructor
        setLBracket(_lBracket_);

        setColumn(_column_);

        setRBracket(_rBracket_);

    }

    @Override
    public Object clone()
    {
        return new AColumnMatrix(
            cloneNode(this._lBracket_),
            cloneNode(this._column_),
            cloneNode(this._rBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAColumnMatrix(this);
    }

    public TLBracket getLBracket()
    {
        return this._lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(this._lBracket_ != null)
        {
            this._lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBracket_ = node;
    }

    public PColumn getColumn()
    {
        return this._column_;
    }

    public void setColumn(PColumn node)
    {
        if(this._column_ != null)
        {
            this._column_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._column_ = node;
    }

    public TRBracket getRBracket()
    {
        return this._rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(this._rBracket_ != null)
        {
            this._rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBracket_)
            + toString(this._column_)
            + toString(this._rBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBracket_ == child)
        {
            this._lBracket_ = null;
            return;
        }

        if(this._column_ == child)
        {
            this._column_ = null;
            return;
        }

        if(this._rBracket_ == child)
        {
            this._rBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(this._column_ == oldChild)
        {
            setColumn((PColumn) newChild);
            return;
        }

        if(this._rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}