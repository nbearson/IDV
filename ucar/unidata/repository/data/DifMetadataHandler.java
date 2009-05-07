/**
 *
 * Copyright 1997-2005 Unidata Program Center/University Corporation for
 * Atmospheric Research, P.O. Box 3000, Boulder, CO 80307,
 * support@unidata.ucar.edu.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTYP; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package ucar.unidata.repository.data;


import org.w3c.dom.*;


import ucar.ma2.*;

import ucar.nc2.Attribute;
import ucar.nc2.Variable;


import ucar.nc2.VariableSimpleIF;
import ucar.nc2.constants.AxisType;
import ucar.nc2.dataset.CoordinateAxis;

import ucar.nc2.dataset.CoordinateSystem;
import ucar.nc2.dataset.NetcdfDataset;


import ucar.unidata.geoloc.LatLonRect;
import ucar.unidata.geoloc.ProjectionImpl;

import ucar.unidata.repository.*;

import ucar.unidata.sql.SqlUtil;
import ucar.unidata.util.CatalogUtil;
import ucar.unidata.util.DateUtil;
import ucar.unidata.util.HtmlUtil;
import ucar.unidata.util.IOUtil;
import ucar.unidata.util.Misc;




import ucar.unidata.util.StringUtil;
import ucar.unidata.util.TwoFacedObject;
import ucar.unidata.xml.XmlUtil;



import visad.Unit;

import java.io.File;


import java.sql.Statement;


import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;


/**
 *
 *
 * @author IDV Development Team
 * @version $Revision: 1.3 $
 */
public class DifMetadataHandler extends MetadataHandler {

    /** _more_ */
    public static final String TYPE_ENTRY_TITLE="dif.entry_title";
    public static final String TYPE_DATA_SET_CITATION="dif.data_set_citation";
    public static final String TYPE_PERSONNEL="dif.personnel";
    public static final String TYPE_PARAMETERS="dif.parameters";
    public static final String TYPE_ISO_TOPIC_CATEGORY="dif.iso_topic_category";
    public static final String TYPE_KEYWORD="dif.keyword";
    public static final String TYPE_DATA_SET_PROGRESS="dif.data_set_progress";
    public static final String TYPE_LOCATION="dif.location";
    public static final String TYPE_QUALITY="dif.quality";
    public static final String TYPE_DATA_SET_LANGUAGE="dif.data_set_language";
    public static final String TYPE_ORIGINATING_CENTER="dif.originating_center";
    public static final String TYPE_DATA_CENTER="dif.data_center";
    public static final String TYPE_DISTRIBUTION="dif.distribution";
    public static final String TYPE_REFERENCE="dif.reference";
    public static final String TYPE_SUMMARY="dif.summary";
    public static final String TYPE_RELATED_URL="dif.related_url";
    public static final String TYPE_METADATA_NAME="dif.metadata_name";
    public static final String TYPE_METADATA_VERSION="dif.metadata_version";
    public static final String TYPE_="dif.";


    public DifMetadataHandler(Repository repository)
            throws Exception {
        super(repository);
    }


    /**
     * _more_
     *
     * @param repository _more_
     * @param node _more_
     * @throws Exception _more_
     */
    public DifMetadataHandler(Repository repository, Element node)
            throws Exception {
        super(repository, node);
    }




}
