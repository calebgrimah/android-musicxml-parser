package haivo.us.scanmusicpro.model.xml

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml
data class Time(
        @PropertyElement
        val beats: String?,

        @PropertyElement(name = "beat-type")
        val beatType: String?,

        @PropertyElement
        val symbol: String?
)
