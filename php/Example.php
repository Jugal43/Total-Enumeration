<?php 
include_once 'TotalEnumeration.php';
$combo = [
    [1, 2],
    [3, 4, 5],
    [6, 7, 8, 9, 10]
];

$TotalEnumeration = new TotalEnumeration($combo);

foreach ($TotalEnumeration->generate() as $value)
{
    print_r($value);
}
