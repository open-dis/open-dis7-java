package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7561db12
 * Country: Oman (OMN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17970
 */
public class QahirClassFSG extends EntityType
{
    public QahirClassFSG()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 17969, Frigate (including Corvettes)
        setSubCategory((byte)1); // uid 17970, Qahir Class (FSG)
    }
}
