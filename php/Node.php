<?php

class Node implements Iterator
{

    private $next = null;
    private $root = null;
    public $prev = null;
    public $position = 0;
    private $array = array();
    private $totalIndex = 0;

    public function __construct($list, $prev, $root)
    {
        $this->array = $list;
        $this->prev = $prev;
        $this->totalIndex = count($list) - 1;
        $this->position = 0;
        $this->root = $root;
    }

    function rewind()
    {
        $this->position = 0;
    }

    function current()
    {
        return $this->array[$this->position];
    }

    function key()
    {
        return $this->position;
    }

    function next()
    {
        if ($this->position >= $this->totalIndex)
        {

            if ($this->prev != null)
            {
                $this->rewind();
                $this->prev->next();
                return;
            } else
            {
                ++$this->position;
            }
        } else
        {
            ++$this->position;
        }
    }

    function valid()
    {
        if ($this->root != null && $this->root->position <= $this->root->totalIndex)
        {
            return true;
        } elseif ($this->position > $this->totalIndex)
        {
            return FALSE;
        }
    }

}
