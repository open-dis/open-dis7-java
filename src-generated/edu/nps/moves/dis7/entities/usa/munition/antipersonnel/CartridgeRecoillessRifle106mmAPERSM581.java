package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14b5752f;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 23967
 */
public class CartridgeRecoillessRifle106mmAPERSM581 extends EntityType
{
    /** Default constructor */
    public CartridgeRecoillessRifle106mmAPERSM581()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 19810, Ballistic
        setSubCategory((byte)15); // uid 23966, 106 mm
        setSpecific((byte)1); // uid 23967, Cartridge, Recoilless Rifle, 106mm, APERS, M581
    }
}
