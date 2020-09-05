package lk.kmartsuper.asset.supplierItem.entity;


import com.fasterxml.jackson.annotation.JsonFilter;
import lk.kmartsuper.asset.item.entity.Item;
import lk.kmartsuper.asset.supplier.entity.Supplier;
import lk.kmartsuper.asset.supplierItem.entity.Enum.ItemSupplierStatus;
import lk.kmartsuper.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("SupplierItem")
public class SupplierItem extends AuditEntity {

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private ItemSupplierStatus itemSupplierStatus;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Supplier supplier;

}
