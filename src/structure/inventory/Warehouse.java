package structure.inventory;

public class Warehouse {

    private int warehouseId;
    private String warehouseName;
    private String inventories;

    public Warehouse() {
    }

    public Warehouse(int warehouseId, String warehouseName, String inventories) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.inventories = inventories;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getInventories() {
        return inventories;
    }

    public void setInventories(String inventories) {
        this.inventories = inventories;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseId=" + warehouseId +
                ", warehouseName='" + warehouseName + '\'' +
                ", inventories='" + inventories + '\'' +
                '}';
    }
}
