package edu.nps.moves.dis7.entities.fra.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34edd065;
 * Country: France (FRA);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 29554
 */
public class CasedTelescopicAmmunitionCTA extends EntityType
{
    /** Default constructor */
    public CasedTelescopicAmmunitionCTA()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 21128, Ballistic
        setSubCategory((byte)22); // uid 29553, 40mm
        setSpecific((byte)1); // uid 29554, Cased Telescopic Ammunition (CTA)
    }
}
