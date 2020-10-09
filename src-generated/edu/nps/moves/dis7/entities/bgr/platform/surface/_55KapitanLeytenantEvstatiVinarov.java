package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20398b7c
 * Country: Bulgaria (BGR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 32901
 */
public class _55KapitanLeytenantEvstatiVinarov extends EntityType
{
    public _55KapitanLeytenantEvstatiVinarov()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27886, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 32896, Olya Class (Project 1259)
        setSpecific((byte)5); // uid 32901, 55 Kapitan Leytenant Evstati Vinarov
    }
}
