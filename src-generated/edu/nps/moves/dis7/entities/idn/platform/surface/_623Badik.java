package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d3ac898;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29813
 */
public class _623Badik extends EntityType
{
    /** Default constructor */
    public _623Badik()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29615, Fast Attack Craft
        setSubCategory((byte)3); // uid 29810, Mandau Class (Fast Attack Craft-Missile)
        setSpecific((byte)3); // uid 29813, 623 Badik
    }
}
