package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1055e4af;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29413
 */
public class HaulmarkTrailerHeavyDollySetLowLoaderConverter extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerHeavyDollySetLowLoaderConverter()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 29410, Heavy Equipment Transport Trailer
        setSubCategory((byte)3); // uid 29413, Haulmark - Trailer, Heavy, Dolly Set, Low Loader Converter
    }
}
