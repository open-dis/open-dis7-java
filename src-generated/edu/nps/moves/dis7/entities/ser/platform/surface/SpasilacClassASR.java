package edu.nps.moves.dis7.entities.ser.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@18460128;
 * Country: Serbia and Montenegro;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19084
 */
public class SpasilacClassASR extends EntityType
{
    /** Default constructor */
    public SpasilacClassASR()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19083, Auxiliary
        setSubCategory((byte)1); // uid 19084, Spasilac Class (ASR)
    }
}
