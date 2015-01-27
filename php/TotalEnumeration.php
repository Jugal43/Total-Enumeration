<?php 
include_once 'Node.php';
class TotalEnumeration
{

    private $iterator = null;

    function __construct($multiList)
    {
        $root = null;
        foreach ($multiList as $onelist)
        {
            $temp = new Node($onelist, $temp, $root);
            if ($root == null)
                $root = $temp;
        }
        $this->iterator = $temp;
    }

    public function generate()
    {
        foreach ($this->iterator as $key => $value)
        {
            $temTrv = $this->iterator;
            $yieldList = [];
            while ($temTrv != null)
            {
                $yieldList[] = $temTrv->current();
                $temTrv = $temTrv->prev;
            }
            yield $yieldList;
        }
    }

}