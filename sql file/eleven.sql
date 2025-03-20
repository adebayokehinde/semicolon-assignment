use cape_codd;

select SKU,SKU_description,WarehouseID from inventory where QuantityOnHand > 0 AND QuantityOnOrder > 0 order by  WarehouseID DESC, SKU ASC;