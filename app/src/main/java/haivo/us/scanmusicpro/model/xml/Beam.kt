package haivo.us.scanmusicpro.model.xml

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.TextContent
import com.tickaroo.tikxml.annotation.Xml

@Xml
data class Beam(
        //    begin, continue, end

        @Attribute
        val number: String?,

        @TextContent
        val description: String?
)