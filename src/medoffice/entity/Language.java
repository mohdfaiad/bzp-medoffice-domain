package medoffice.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Basic(optional = false)
   @Column(name = "name")
   private String name;

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (code != null ? code.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Language)) {
         return false;
      }
      Language other = (Language) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Language[code=" + code + "]";
   }  
}