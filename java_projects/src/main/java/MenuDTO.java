import java.util.ArrayList;
import java.util.List;

public class MenuDTO {

    private String Id;
    private String name;
    private String parentId;
    private List<MenuDTO> childrenItems;

    public MenuDTO() {
        this.Id = "";
        this.name = "";
        this.parentId = "";
        this.childrenItems = new ArrayList<MenuDTO>();
    }

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public List<MenuDTO> getChildrenItems() {
        return childrenItems;
    }
    public void setChildrenItems(List<MenuDTO> childrenItems) {
        this.childrenItems = childrenItems;
    }
    public void addChildrenItem(MenuDTO childrenItem){
        if(!this.childrenItems.contains(childrenItem))
            this.childrenItems.add(childrenItem);
    }

    @Override
    public String toString() {
        return "MenuDTO [Id=" + Id + ", name=" + name + ", parentId="
                + parentId + ", childrenItems=" + childrenItems + "]";
    }

}