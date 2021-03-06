package edu.nps.moves.dis7.entities.kir.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@592e843a;
 * Country: Kiribati (KIR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26706
 */
public class Teanoai extends EntityType
{
    /** Default constructor */
    public Teanoai()
    {
        setCountry(Country.KIRIBATI_KIR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26704, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26705, Pacific Class Patrol Boat
        setSpecific((byte)1); // uid 26706, Teanoai
    }
}
