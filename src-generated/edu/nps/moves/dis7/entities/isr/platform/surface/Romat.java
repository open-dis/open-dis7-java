package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f6db3fb;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18219
 */
public class Romat extends EntityType
{
    /** Default constructor */
    public Romat()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18214, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18218, Hetz (Saar 4.5) (fast attack craft-missile)
        setSpecific((byte)1); // uid 18219, Romat
    }
}
