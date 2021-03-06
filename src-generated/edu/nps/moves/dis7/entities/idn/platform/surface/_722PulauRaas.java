package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d9ac0b4;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31060
 */
public class _722PulauRaas extends EntityType
{
    /** Default constructor */
    public _722PulauRaas()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 31057, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 31058, Kondor II Class
        setSpecific((byte)2); // uid 31060, 722 Pulau Raas
    }
}
