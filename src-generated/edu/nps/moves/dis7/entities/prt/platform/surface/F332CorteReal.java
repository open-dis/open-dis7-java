package edu.nps.moves.dis7.entities.prt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@241a0c3a;
 * Country: Portugal (PRT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23094
 */
public class F332CorteReal extends EntityType
{
    /** Default constructor */
    public F332CorteReal()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23090, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23091, Vasco Da Gama (Meko 200) Class
        setSpecific((byte)3); // uid 23094, F332 Corte Real
    }
}
