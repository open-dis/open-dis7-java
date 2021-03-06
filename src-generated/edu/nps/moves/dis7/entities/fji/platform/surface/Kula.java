package edu.nps.moves.dis7.entities.fji.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23348b5d;
 * Country: Fiji (FJI);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26696
 */
public class Kula extends EntityType
{
    /** Default constructor */
    public Kula()
    {
        setCountry(Country.FIJI_FJI);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26694, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26695, Pacific Class Patrol Boat
        setSpecific((byte)1); // uid 26696, Kula
    }
}
