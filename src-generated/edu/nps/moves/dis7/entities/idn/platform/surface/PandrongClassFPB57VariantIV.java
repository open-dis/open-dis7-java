package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6986bbaf;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31049
 */
public class PandrongClassFPB57VariantIV extends EntityType
{
    /** Default constructor */
    public PandrongClassFPB57VariantIV()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 31038, Light/Patrol Craft
        setSubCategory((byte)7); // uid 31049, Pandrong Class (FPB 57 Variant IV)
    }
}
