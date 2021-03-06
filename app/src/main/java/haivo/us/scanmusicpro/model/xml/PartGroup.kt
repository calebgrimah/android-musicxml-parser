package haivo.us.scanmusicpro.model.xml

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "part-group")
data class PartGroup(

        @Attribute
        val number: String?,
        @Attribute
        val type: String?,
        @PropertyElement(name = "group-symbol")
        val groupSymbol: String?
)