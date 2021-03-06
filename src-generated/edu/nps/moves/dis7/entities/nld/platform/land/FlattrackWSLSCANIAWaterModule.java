package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@226f885f;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27953
 */
public class FlattrackWSLSCANIAWaterModule extends EntityType
{
    /** Default constructor */
    public FlattrackWSLSCANIAWaterModule()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 27952, Water Trailer
        setSubCategory((byte)1); // uid 27953, Flattrack WSL SCANIA Water Module
    }
}
