package edu.nps.moves.dis7.entities.isr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@19553973;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 18251
 */
public class Gal extends EntityType
{
    /** Default constructor */
    public Gal()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 18249, SSG (Conventional Guided Missile)
        setSubCategory((byte)1); // uid 18250, Gal (Vickers Type 540) Class
        setSpecific((byte)1); // uid 18251, Gal
    }
}
