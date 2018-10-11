<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<quotations>
			<xsl:apply-templates />
		</quotations>
	</xsl:template>

	<xsl:template match="jsonElement">
		<quotation>
			<xsl:value-of select="reference" />
			-
			<xsl:value-of select="cost" />
			(<xsl:value-of select="currency" />)
		</quotation>
	</xsl:template>
</xsl:stylesheet>