package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67304a40;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31671
 */
public class KupangClass extends EntityType
{
    /** Default constructor */
    public KupangClass()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 31668, Landing Craft
        setSubCategory((byte)2); // uid 31671, Kupang Class
    }
}
